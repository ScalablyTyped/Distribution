organization := "org.scalablytyped"
name := "webpack-dev-middleware"
version := "2.0-dt-20190624Z-8c1411"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-facedf",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-7c6e52",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-dcf9e0",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-9a0613",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-86c6de",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-8f1343")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        