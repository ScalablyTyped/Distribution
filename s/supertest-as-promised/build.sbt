organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-ab837e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-d0c235",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-831f18",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-58fb79",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190322Z-fda454")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        