organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-8d5be9"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-7f6a30",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-27e6e5",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-8ef17f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-72dac4",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-8017dc",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-bcd10f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-9875f5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-d9cc4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200624Z-cd1cc0",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-9eb00d",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-72a943",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-c73d93",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-723b36",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200515Z-a09b4e",
  "org.scalablytyped" %%% "koa-compress" % "v4.x-dt-20200515Z-058e7c",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20200226Z-32f5e8",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20200515Z-7c7457",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-a16f63",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-a33080",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-13df6b",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-45e2e8",
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
