organization := "org.scalablytyped"
name := "uifabric__foundation"
version := "7.5.14-077f3d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20200129Z-2ce3f4",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20200207Z-a0236c",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-d72a6c",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.8.6-801e73",
  "org.scalablytyped" %%% "uifabric__styling" % "7.10.14-5f0705",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.12.5-6f8321")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
