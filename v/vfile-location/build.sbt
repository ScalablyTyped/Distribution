organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-b2a841"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-c13c12",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-eef92f",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-084c46")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        