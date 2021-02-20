organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "1.2-dt-20201022Z-deab91"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-97a3df",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-210a9e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-5add15",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-9d7c92",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-321a92",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2a8190",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-49f0c4",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-a98b3d",
  "org.scalablytyped" %%% "globby" % "11.0.1-3b8367",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-1001c3",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-25890c",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-77de6b",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-c1b451",
  "org.scalablytyped" %%% "koa-compress" % "v4.x-dt-20201002Z-b846ae",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20200226Z-5d6a6e",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20200515Z-e944cf",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-901708",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-b44da9",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-e9173e",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-931078",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-cf0dc0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-7640b4",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
