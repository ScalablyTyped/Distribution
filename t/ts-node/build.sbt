organization := "com.scalablytyped"
name := "ts-node"
version := "7.0.1-2272af"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "arrify" % "1.0-dt-20181102Z-13de40",
  "com.scalablytyped" %%% "buffer-from" % "1.1-dt-20181102Z-48a000",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-5885f0",
  "com.scalablytyped" %%% "make-error" % "1.3.5-8880cf",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "mkdirp" % "0.5-dt-20181102Z-d16a31",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20181102Z-cef98d",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "typescript" % "3.1.6-0ff591",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        