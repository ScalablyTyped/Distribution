organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-e26574"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1b173b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200209Z-2b8189",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-985947",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-94cb10",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-8a1284",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-088b82",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-7c5084",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-a2882d",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-ed0c2f",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-d44988",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-e3e0ee",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-452939")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
