organization := "org.scalablytyped"
name := "webpack-hot-middleware"
version := "2.16-dt-20190212Z-5972fe"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-44bb30",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8f9eda",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-2a8016",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04c49c",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-8d90ab",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-05d063",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190825Z-fd6a0e",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-10033f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        