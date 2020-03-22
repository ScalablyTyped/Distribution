organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-bf330f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-00a5a8",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-da489b",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-02ea5e",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200225Z-55dd5c",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-a2d86c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
