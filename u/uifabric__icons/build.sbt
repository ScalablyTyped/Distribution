organization := "org.scalablytyped"
name := "uifabric__icons"
version := "7.5.17-da44f8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-4f76fe",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-b93e21",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "1.1.1-35837d",
  "org.scalablytyped" %%% "fluentui__theme" % "1.7.0-febd11",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-test-renderer" % "17.0-dt-20201120Z-586dfa",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-bb1238",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-4689f3",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.19.1-35ab7c",
  "org.scalablytyped" %%% "uifabric__styling" % "7.16.18-4e56d6",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.33.2-a567a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
