organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "3.1-dt-20180917Z-dbd935"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-3370a7",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-984ce4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-3335a7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-420192",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-ec2aeb",
  "org.scalablytyped" %%% "http-proxy" % "1.16-dt-20180910Z-7e7c37",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20181120Z-d40279",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-06fcdd",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6ade85",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-a6cca8",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3c1589",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181210Z-27d122")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        