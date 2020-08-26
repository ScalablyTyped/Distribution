organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-a95e31"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-b8d3d8",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-3a735c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-3cac79",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-750bd0",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-6ae7b7",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-a4d316",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200706Z-53ce1b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200722Z-ebd859",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-217b92",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-7243c3",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-1e83e1",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-01fba0",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200515Z-08bb41",
  "org.scalablytyped" %%% "koa-compress" % "v4.x-dt-20200515Z-4d133a",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20200226Z-df04ed",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20200515Z-0b0f03",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-298525",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-225474",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-95b1f7",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-032fc3",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-556671",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3a906b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-4f6d32",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
