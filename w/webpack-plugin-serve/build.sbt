organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-9b3ffb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7c16b9",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-562662",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-cc0ef5",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20190422Z-7eca32",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-07dbf2",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-4e1455",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-d60826",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-f4e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-868c54",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-a5f0bd",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200109Z-0b89ee",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-29e442",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-ef55d8",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200211Z-010306",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-f59980",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-29002b",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-6fa83c",
  "org.scalablytyped" %%% "micromatch" % "4.0-dt-20200127Z-1a75cf",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-4fb0bc",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-61cabd",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-7c1dac",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-d83efd",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-a63dfc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d8ff1",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-934b96",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ed6d57",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200209Z-7b3b5d",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-120b1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
