organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-06f4d9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-562662",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-a63dfc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d8ff1",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-934b96",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ed6d57",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200209Z-7b3b5d",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-3d4dc1",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-f57e58",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-49e7a6",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-298dcd",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-85fe31",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-fc64df",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-bcaebc",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-5b4c74",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-48f23b",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-120b1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
