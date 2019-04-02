organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20190322Z-3e01ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-0a0b93",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-54f634",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-dea611",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-fea888",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-5d06ef",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-ad49e2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-5108a8",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-831268",
  "org.scalablytyped" %%% "winston" % "3.2.1-0ba935",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-01faf0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        