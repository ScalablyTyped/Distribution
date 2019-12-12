organization := "org.scalablytyped"
name := "uifabric__utilities"
version := "7.5.0-79b5f8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20191112Z-a2a9d8",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20190715Z-8904b6",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-c3a1fc",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.8.1-1b6bb3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        