organization := "org.scalablytyped"
name := "xo"
version := "0.28-dt-20200313Z-7f56e9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint" % "6.8-dt-20200406Z-49daad",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200320Z-7314fa",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200225Z-b489dd",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
