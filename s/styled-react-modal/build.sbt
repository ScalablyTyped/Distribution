organization := "org.scalablytyped"
name := "styled-react-modal"
version := "1.2-dt-20190506Z-a3d9f3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-56dde3",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190519Z-6c4aa0",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190513Z-0886ba")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        