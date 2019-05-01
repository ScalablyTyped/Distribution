organization := "org.scalablytyped"
name := "webpack-subresource-integrity"
version := "1.2-dt-20181031Z-2b9364"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c26764",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6cb46e",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6fe94b",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a6952d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190428Z-0cf455")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        