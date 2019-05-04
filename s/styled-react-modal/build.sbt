organization := "org.scalablytyped"
name := "styled-react-modal"
version := "1.1-dt-20190126Z-b7ce3d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190504Z-19278e",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190429Z-832331",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190408Z-bd6d6e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        