organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20191113Z-016df6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-901fe2",
  "org.scalablytyped" %%% "vfile" % "4.0.2-fae3d1",
  "org.scalablytyped" %%% "vfile-message" % "2.0.2-98bb3c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        