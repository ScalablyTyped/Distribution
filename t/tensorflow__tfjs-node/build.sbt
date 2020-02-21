organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.5.2-92e148"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.5.2-be7f4f",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.5.2-ec440e",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.5.2-21d291",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.5.2-57e1ee",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.5.2-405b51")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
