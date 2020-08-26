organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20200515Z-9629cd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-ff5daa",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200706Z-a50676",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20200515Z-1f3b83",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20200515Z-a1bbc3",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20200515Z-a164e5",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20200515Z-eadcca",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20200515Z-5bcd06",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20200515Z-777cb4",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20200515Z-12c5c9",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20200515Z-56c6c6",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20200515Z-7208c4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
