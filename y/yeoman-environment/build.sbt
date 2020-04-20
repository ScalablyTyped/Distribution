organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-66cc9f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-8b5ea8",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-659e8b",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-62f03a",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-7f568a",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-9f3b8d",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200225Z-bbc6a1",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-e33586")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
