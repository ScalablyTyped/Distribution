organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-37cb0b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-4d5132",
  "org.scalablytyped" %%% "cfb" % "1.1.0-02ee9c",
  "org.scalablytyped" %%% "codepage" % "1.14.0-ee86c2",
  "org.scalablytyped" %%% "commander" % "2.19.0-13b951",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-6300e7",
  "org.scalablytyped" %%% "frac" % "1.1.2-ed9b7b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "printj" % "1.1.2-612ceb",
  "org.scalablytyped" %%% "ssf" % "0.10.2-c78da4",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        