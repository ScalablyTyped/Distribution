organization := "org.scalablytyped"
name := "webpack-node-externals"
version := "1.7-dt-20200129Z-87a33b"
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
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-452939")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
