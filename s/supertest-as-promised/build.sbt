organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-ae45d6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-8ef956",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-527010",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-5fb858",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190322Z-35b063")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        