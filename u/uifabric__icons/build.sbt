organization := "org.scalablytyped"
name := "uifabric__icons"
version := "7.3.57-f76d25"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20200515Z-395ec2",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20200515Z-2b55e0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "react-test-renderer" % "16.9-dt-20200515Z-a656c4",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20200521Z-56f27e",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-88541a",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.16.0-b0d1e5",
  "org.scalablytyped" %%% "uifabric__styling" % "7.13.5-2f8cce",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.22.0-a2acf2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
