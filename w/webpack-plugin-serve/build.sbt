organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "1.2-dt-20201022Z-341dbd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-d5a941",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-1ee684",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-0ed49a",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-434816",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-0bcefa",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-fb786d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-4e2465",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-5cfbde",
  "org.scalablytyped" %%% "globby" % "11.0.1-ec0456",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-66b09b",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-290043",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-4720bf",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-59beae",
  "org.scalablytyped" %%% "koa-compress" % "v4.x-dt-20201002Z-5dd1d8",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20200226Z-7d72d4",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20200515Z-22fb2f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-418907",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-07391b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-0d4703",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-140aab",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-805ca8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-e007a0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-22aab1",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
