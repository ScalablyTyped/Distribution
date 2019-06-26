organization := "org.scalablytyped"
name := "styled-react-modal"
version := "1.2-dt-20190506Z-441a85"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-8d8143",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190625Z-5d5e58",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190604Z-c6401e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        