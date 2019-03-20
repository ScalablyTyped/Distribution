organization := "org.scalablytyped"
name := "typedoc"
version := "0.14.2-bd2244"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-27d691",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-16ba97",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-d101f5",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-36c82d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190307Z-48199e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-ebcd79",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-d01cfb",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-15a9f1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "typescript" % "3.3.4000-09c87f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        