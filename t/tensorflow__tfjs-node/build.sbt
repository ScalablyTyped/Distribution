organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.7.2-d14395"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.7.2-ceda49",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.7.2-af8934",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.7.2-b14d6c",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.7.2-df1db7",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.7.2-60ab3d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
