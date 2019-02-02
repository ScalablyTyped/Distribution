organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-cb92ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-5312cb",
  "org.scalablytyped" %%% "cfb" % "1.1.0-9bbc2c",
  "org.scalablytyped" %%% "codepage" % "1.14.0-ba5723",
  "org.scalablytyped" %%% "commander" % "2.19.0-7de1c1",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-0ad627",
  "org.scalablytyped" %%% "frac" % "1.1.2-0146e0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "printj" % "1.1.2-cbd759",
  "org.scalablytyped" %%% "ssf" % "0.10.2-e94a07",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        