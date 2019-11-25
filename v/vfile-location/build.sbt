organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20191113Z-c94977"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-d73c6d",
  "org.scalablytyped" %%% "vfile" % "4.0.2-fa23cc",
  "org.scalablytyped" %%% "vfile-message" % "2.0.2-71e297")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        