organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-5f5903"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-334832",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20190925Z-7b35af",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-11f937")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        