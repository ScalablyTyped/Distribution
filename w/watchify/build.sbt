organization := "org.scalablytyped"
name := "watchify"
version := "v3.7.0-dt-20190322Z-cb80c9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20190322Z-a5b762",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20190212Z-5ce4cb",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        