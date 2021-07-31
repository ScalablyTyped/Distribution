organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "1.2-dt-20201022Z-818e0a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-2396e3",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-0ef592",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-cc520f",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-83e4b4",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-abe02b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2f63a9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-2cc92e",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-360f6b",
  "org.scalablytyped" %%% "globby" % "11.0.1-9296ef",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-ab438c",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-7de39e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-ec699e",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-224cba",
  "org.scalablytyped" %%% "koa-compress" % "v4.x-dt-20201002Z-87e6bf",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20200226Z-17c9b7",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20200515Z-421246",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-35349b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-3e7227",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-38a918",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-7c329b",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-f5b664",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-f95694",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
