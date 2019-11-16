organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20191113Z-695bd4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-c3c8d2",
  "org.scalablytyped" %%% "vfile" % "4.0.2-f0aa4c",
  "org.scalablytyped" %%% "vfile-message" % "2.0.2-3bd3b8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        