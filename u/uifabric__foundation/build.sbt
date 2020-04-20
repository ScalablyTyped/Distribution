organization := "org.scalablytyped"
name := "uifabric__foundation"
version := "7.7.3-c728c2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20200320Z-d2125e",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20200225Z-672990",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20200331Z-ce0e6f",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-844029",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.11.0-551479",
  "org.scalablytyped" %%% "uifabric__styling" % "7.11.6-3f2f10",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.15.10-565857")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
