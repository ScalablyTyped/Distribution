organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-642e4c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20181205Z-45dd43",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-343c18",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-4caaf8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        