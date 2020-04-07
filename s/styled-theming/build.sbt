organization := "org.scalablytyped"
name := "styled-theming"
version := "2.2-dt-20190627Z-2c6da5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-9ea254",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200318Z-8663a9",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "styled-components" % "5.0-dt-20200225Z-9b38c5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
