organization := "org.scalablytyped"
name := "webpack-dev-middleware"
version := "2.0-dt-20180910Z-a79d53"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-248c45",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-448588",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180910Z-c96227",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180920Z-c611fe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-faaeaa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-3b1759",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d2faab",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-cc64d6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        