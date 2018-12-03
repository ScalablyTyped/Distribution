organization := "com.scalablytyped"
name := "superagent-bunyan"
version := "5.2-dt-20181018Z-3f5935"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-08fe9c",
  "com.scalablytyped" %%% "cookiejar" % "2.1-dt-20180910Z-815fd7",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "superagent" % "3.8-dt-20180910Z-a6138d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        