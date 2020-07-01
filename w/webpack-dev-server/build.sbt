organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "3.11-dt-20200521Z-2fc7b2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-27e6e5",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-8ef17f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-72dac4",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-8017dc",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-d9cc4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200624Z-cd1cc0",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-72a943",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-c73d93",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-a16f63",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7b3798",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c5e2e8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9b0303",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200515Z-4452f0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8b5450",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200616Z-5e4f80",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200519Z-be9296",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200625Z-9ee427",
  "org.scalablytyped" %%% "webpack-sources" % "1.4-dt-20200602Z-d8355c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
