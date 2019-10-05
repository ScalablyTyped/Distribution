organization := "org.scalablytyped"
name := "typescript-eslint__parser"
version := "1.13.0-388e8d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint-visitor-keys" % "1.0-dt-20180217Z-e870a9",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-9fcec6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "typescript" % "3.6.3-9955ce",
  "org.scalablytyped" %%% "typescript-eslint__experimental-utils" % "1.13.0-bc9fb9",
  "org.scalablytyped" %%% "typescript-eslint__typescript-estree" % "1.13.0-ace239")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        