organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.4.0-be990f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.4.0-94a688",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.4.0-2b1d22",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.4.0-832800",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.4.0-53aefa",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.4.0-178eef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        