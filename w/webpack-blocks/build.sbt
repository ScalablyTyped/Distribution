organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20200515Z-cf6306"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-5191e5",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200515Z-de971c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f960ba",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200515Z-5a96a6",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200519Z-c8112b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200515Z-d3982a",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20200515Z-a5de5e",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20200515Z-ac7362",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20200515Z-4fd5f9",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20200515Z-edf9a0",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20200515Z-9b94ed",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20200515Z-acc985",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20200515Z-60784a",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20200515Z-c0376f",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20200515Z-bf6549",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200515Z-c42b06")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
