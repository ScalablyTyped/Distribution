organization := "org.scalablytyped"
name := "typescript-eslint__parser"
version := "2.8.0-bbc093"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint-visitor-keys" % "1.0-dt-20180217Z-747b6b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-a1a6ec",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "typescript" % "3.7.2-013da6",
  "org.scalablytyped" %%% "typescript-eslint__experimental-utils" % "2.8.0-305d4a",
  "org.scalablytyped" %%% "typescript-eslint__typescript-estree" % "2.8.0-278623")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        