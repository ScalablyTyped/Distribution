organization := "org.scalablytyped"
name := "yeoman-test"
version := "2.0-dt-20181204Z-484607"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-bf2803",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-01905d",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-9a7fbb",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-1bda7e",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-5b5635",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-f67045",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-2a1127",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-5aff23",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-6e36eb",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-d200c0",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-c3e153",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-27766f",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-368028",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-863d71",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-c19ad8",
  "org.scalablytyped" %%% "yeoman-generator" % "3.0-dt-20181116Z-887e74")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        