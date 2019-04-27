organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190221Z-8aac53"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-e9bc8b",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-4b90e8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-5914c9",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190322Z-b9b716")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        