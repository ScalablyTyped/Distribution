organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20200925Z-6e1302"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-d3bdbd",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "uglify-js" % "3.11-dt-20201027Z-35d0b2",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20200925Z-fdd3e6",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20200925Z-d43c5a",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20200925Z-a3170a",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20200925Z-40e0e5",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20200925Z-96baf8",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20200925Z-d124c5",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20200925Z-a56f00",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20200925Z-3721b4",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20200925Z-de893b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
