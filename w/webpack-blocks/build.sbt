organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-185571"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1bb4ae",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-0c1f94",
  "org.scalablytyped" %%% "source-map" % "0.7.3-61a869",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-7c6f60",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200413Z-ae3cf4",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200418Z-3147f9",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-5c36a4",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-de4c57",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-e813c1",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-c66a60",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-d4329e",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-eeeb5c",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-792fc1",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-3ce8f9",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-9d8224",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200323Z-81ab5f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
