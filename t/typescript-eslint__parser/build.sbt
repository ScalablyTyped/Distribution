organization := "org.scalablytyped"
name := "typescript-eslint__parser"
version := "1.13.0-2b07f5"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint-visitor-keys" % "1.0-dt-20180217Z-8403d5",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-565518",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "typescript" % "3.5.3-17927e",
  "org.scalablytyped" %%% "typescript-eslint__experimental-utils" % "1.13.0-81745c",
  "org.scalablytyped" %%% "typescript-eslint__typescript-estree" % "1.13.0-928492")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        