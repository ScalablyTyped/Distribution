organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20200925Z-58b014"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-475dad",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "uglify-js" % "3.11-dt-20201027Z-ae49d5",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20200925Z-af8460",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20200925Z-f738dd",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20200925Z-56c3d0",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20200925Z-b626d4",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20200925Z-02f7cf",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20200925Z-263dcb",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20200925Z-988b79",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20200925Z-860a1b",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20200925Z-92e8af")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
