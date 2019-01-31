organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-49cf56"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-4d5132",
  "org.scalablytyped" %%% "cfb" % "1.1.0-e433c6",
  "org.scalablytyped" %%% "codepage" % "1.14.0-21d9e5",
  "org.scalablytyped" %%% "commander" % "2.19.0-a0e41a",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-6300e7",
  "org.scalablytyped" %%% "frac" % "1.1.2-ed9b7b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "printj" % "1.1.2-612ceb",
  "org.scalablytyped" %%% "ssf" % "0.10.2-c78da4",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        